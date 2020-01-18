package pl.behavioral.command;

public class CommandPattern {

    public static void main(String[] args) {
        DocumentCreator documentCreator = new DocumentCreator();

        documentCreator.setCommand(new GenerateTitleCommand(new TitleGenerator()));
        documentCreator.setCommand(new GenerateDescriptionCommand(new DescriptionGenerator()));

        documentCreator.createDocument();
    }

}
