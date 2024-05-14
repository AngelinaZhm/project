public class Response {
    private String feedback;
    public Response (String feedback){
        this.feedback = feedback;
    }
    public void displayFeedback(){
        System.out.println("Ваш відгук : " + feedback);
    }
    public void displayThankYou(){
        System.out.println("Дякуємо за ваш відгук!");
    }
}