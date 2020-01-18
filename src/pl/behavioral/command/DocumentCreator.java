package pl.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class DocumentCreator {

    private final List<GenerateCommand> commands = new ArrayList<>();

    public void setCommand(GenerateCommand command) {
        commands.add(command);
    }

    public void createDocument() {
        commands.forEach(c -> c.execute());
    }
}
