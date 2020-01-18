package pl.behavioral.command;

public class GenerateTitleCommand implements GenerateCommand {

    private final TitleGenerator titleGenerator;

    public GenerateTitleCommand(TitleGenerator titleGenerator) {
        this.titleGenerator = titleGenerator;
    }

    @Override
    public void execute() {
        titleGenerator.generateTitle();
    }

}
