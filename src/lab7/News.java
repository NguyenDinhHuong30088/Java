package lab7;

public class News implements INews {
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    Float AverageRate;

    public News(int ID, String title, String publishDate, String author, String content, Float averageRate, int[] rateList) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.AverageRate = averageRate;
        RateList = rateList;
    }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public String getTitle() { return Title; }
    public void setTitle(String title) { Title = title; }

    public String getPublishDate() { return PublishDate; }
    public void setPublishDate(String publishDate) { PublishDate = publishDate; }

    public String getAuthor() { return Author; }
    public void setAuthor(String author) { Author = author; }

    public String getContent() { return Content; }
    public void setContent(String content) { Content = content; }

    public Float getAverageRate() { return AverageRate; }




    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average rate: " + AverageRate);
    }

    int[] RateList = new int[3];
    void calculate() {
        AverageRate = (float) (RateList[0] + RateList[1] + RateList[2]) / RateList.length;
    }


}
