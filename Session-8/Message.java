import java.io.Serializable;

/**
 * The type Message.
 */
public class Message implements Serializable {

    private final String text;

    /**
     * Instantiates a new Message.
     *
     * @param text the text of msg
     */
    public Message(String text) {
        this.text = text;
    }

    /**
     * Gets text.
     *
     * @return the text of msg
     */
    public String getText() {
        return text;
    }
}
