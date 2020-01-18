package pl.behavioral.command;

public class GenerateDescriptionCommand implements GenerateCommand {

    private final DescriptionGenerator descriptionGenerator;

    public GenerateDescriptionCommand(DescriptionGenerator descriptionGenerator) {
        this.descriptionGenerator = descriptionGenerator;
    }

    @Override
    public void execute() {
        descriptionGenerator.generateDescription();
    }

}
