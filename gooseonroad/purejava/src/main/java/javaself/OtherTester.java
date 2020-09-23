package javaself;

import model.Person;


public class OtherTester {
    public static void main(String[] args) {
        OtherTester tester = new OtherTester();
        tester.entrypoint();
    }
    public void entrypoint() {
        String val = "authflow/reset/pwd?token=${mail_token}&lang=${language}";
        String v1 = val.replace("${mail_token}", "abcdefg");
        String v2 = v1.replace("${language}", "zh-CN");
        System.out.println("val: " + val + ", v1: " + v1 + ", v2: " + v2);
    }

    public void changePerson(Person p) {
        System.out.println("==> Other: Person hashcode: " + p.hashCode() + ", value: " + p.toString());
        p = new Person("B", 20);
        System.out.println("==> Other: Person hashcode: " + p.hashCode() + ", value: " + p.toString());
    }
}
