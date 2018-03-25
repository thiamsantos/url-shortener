package shortener;

public class Main {
    public static void main(String[] args) {
        Shortener shortener = new Shortener();
        System.out.println(shortener.shorten("google.com"));
        System.out.println(shortener.fetch(shortener.shorten("google.com")).getURL());

        String hash = shortener.shorten("google.com");
        shortener.fetch(hash);
        shortener.fetch(hash);
        shortener.fetch(hash);
        shortener.fetch(hash);

        ShortenedURL result = shortener.fetch(hash);
        System.out.println(result.getURL());
        System.out.println(result.getHits());
    }
}
