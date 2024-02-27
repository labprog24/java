import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class TextDisplayApplet extends Applet {
    private String text;
    private String fontName;
    private int fontStyle;
    private int fontSize;

    public void init() {
        text = getParameter("text");
        fontName = getParameter("fontname");
        fontStyle = Integer.parseInt(getParameter("fontstyle"));
        fontSize = Integer.parseInt(getParameter("fontsize"));
    }

    public void paint(Graphics g) {
        Font font = new Font(fontName, fontStyle, fontSize);
        g.setFont(font);
        g.drawString(text, 20, 50);
    }
}
