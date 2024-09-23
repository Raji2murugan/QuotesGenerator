package QuotesGen;

class Quotes {
    private String quote;
    private String author;

    // Getters and Setters
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Quote: " + quote + " - Author: " + author;
    }
}