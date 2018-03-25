package shortener;

import java.util.concurrent.atomic.AtomicInteger;

public class ShortenedURL {
    private String url;
    private AtomicInteger hits;

    public ShortenedURL(String url) {
        this.url = url;
        this.hits = new AtomicInteger();
    }

    public int hit() {
        return this.hits.incrementAndGet();
    }

    public String getURL() {
        return url;
    }

    public int getHits() {
        return hits.get();
    }
}
