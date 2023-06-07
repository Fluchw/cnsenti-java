import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        String text = "今天真开心啊,虽然昨天很难过";
        System.out.println(Emotion.emotionCount(text));
    }
}
