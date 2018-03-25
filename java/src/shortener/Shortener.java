package shortener;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Shortener {
    private HashMap<String, ShortenedURL> urls;

    public Shortener() {
        urls = new HashMap<>();
    }

    public String shorten(String url) {
        ShortenedURL shortenedURL = new ShortenedURL(url);
        int seed = ThreadLocalRandom.current().nextInt();
        String hash = Base62.encode(seed);
        urls.put(hash, shortenedURL);

        return hash;
    }

    public ShortenedURL fetch(String hash) {
        if (!urls.containsKey(hash)) {
            return null;
        }

        ShortenedURL shortenedURL = urls.get(hash);
        shortenedURL.hit();
        return shortenedURL;
    }
}
