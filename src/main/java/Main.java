import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import ui.UI;

void main() {
    final UI ui;
    final Terminal terminal;
    final LineReader reader;

    try {
        terminal = TerminalBuilder.builder().system(true).build();
        reader = LineReaderBuilder.builder().terminal(terminal).build();
        ui = new UI(terminal, reader);
        ui.start();

    } catch (Exception e) {
        e.printStackTrace();
    }

}
