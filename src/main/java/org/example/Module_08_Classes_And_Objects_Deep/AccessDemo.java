package org.example.Module_08_Classes_And_Objects_Deep;

public class AccessDemo {
    public String title = "Поттер";
    private String secret = "Секрет";
	protected int code = 234214;
    boolean isVisible = true;


    public String getSecret() {
        return secret;
    }
}
class AccessTest{
    public static void main(String[] args) {
        AccessDemo accessDemo = new AccessDemo();
        String hey = accessDemo.title;
       // String mey = accessDemo.secret;
        String mey2 = accessDemo.getSecret();
        int key = accessDemo.code;

        System.out.println(hey);
        System.out.println(mey2);
        System.out.println(key);
        System.out.println(accessDemo.isVisible);
    }
}