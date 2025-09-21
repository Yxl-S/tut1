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
<<<<<<< HEAD
    return messages.getString("greeting") + ", " + name.toUpperCase(); // ✅ name 变成大写
  }

  public static void main(String[] args) {
    // 添加参数个数检查，模拟 bug 修复
    if (args.length < 3) {
      System.err.println("Usage: java Greeter <language> <country> <name>");
      System.err.println("Example: java Greeter en US Alice");
      System.exit(1);
=======

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
>>>>>>> ec0c0bb4b4af4e0c6987a3b938f4a8297f3c79de
    }

    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}