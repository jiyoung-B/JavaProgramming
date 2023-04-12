package jy.project.bookmarket;


public class Book {
    private String isbn;
    private String bkname;
    private int price;
    private String author;
    private String desc;
    private String bkdept;
    private String pubdate;

    public Book(String isbn, String bkname, int price, String author, String desc, String bkdept, String pubdate) {
        this.isbn = isbn;
        this.bkname = bkname;
        this.price = price;
        this.author = author;
        this.desc = desc;
        this.bkdept = bkdept;
        this.pubdate = pubdate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBkdept() {
        return bkdept;
    }

    public void setBkdept(String bkdept) {
        this.bkdept = bkdept;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    @Override
    public String toString() {
        String fmt = "%s %s %d %s %s %s %s";
        return String.format(fmt, isbn, bkname, price, author, desc, bkdept, pubdate);
    }
}
