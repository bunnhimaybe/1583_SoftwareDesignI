// Lab 8
// Problem 1
// Email

public class Email{
    private String subject, to, from, body;

    public Email(String subject, String to, String from){
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = "";
    }

    public Email(String subject, String to, String from, String body){
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public void addToBody(String text){
        body += text;
    }

    public boolean equals(Email other){
        if (this.subject == other.subject &&
        this.to == other.to &&
        this.from == other.from &&
        this.body == other.body) return true;
        else return false;
    }

    public String getSubject(){
        return subject;
    }

    public String getTo(){
        return to;
    }

    public String getFrom(){
        return from;
    }

    public String getBody(){
        return body;
    }

    public String toString(){
        return String.format("From: %s; To: %s; Subject: %s; Body: %s", getFrom(), getTo(), getSubject(), getBody());
    }

}