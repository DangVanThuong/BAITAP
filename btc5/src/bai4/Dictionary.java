package bai4;
import java.util.HashMap
public class Dictionary {
    protected HashMap<String, String> a;


    public Dictionary() {
        this.a=new HashMap<>();
        // Thêm dữ liệu vào từ điển
        a.put("apple", "qua táo");
        a.put("ball", "qua bong");
        a.put("cat", "con mèo");
        a.put("dog", "con cho");
        a.put("elephant", "con voi");
        a.put("fish", "con cá");
        a.put("gift", "món qua");
        a.put("home", "nha");
    }


    public Dictionary(HashMap<String, String> a) {
        this.a = a;
    }
    public String lookup(String tu) {
        if(a.containsKey(tu)) {
            return a.get(tu);
        }else {
            return "không tìm thấy từ này trong từ điển ";
        }
    }
}
