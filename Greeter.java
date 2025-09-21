import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

    // 新增：将姓名转为大写
    return messages.getString("greeting") + ", " + name.toUpperCase();

    // 新增：用**加粗姓名
    return messages.getString("greeting") + ", **" + name + "**";

  }

  public static void main(String[] args) {
    // 新增：检查命令行参数长度，不足则提示并退出
    if (args.length < 3) {
      System.out.println("Error: Please provide language, country, and name as arguments.");
      return; // 参数不足，直接退出
    }

    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}