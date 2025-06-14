package top.wmd001.behavioral.state;

public class BusyState implements State
{
    @Override
    public String init() {
        return "Sorry, I'm busy now! ";
    }

    @Override
    public String reply(String input) {
        return "Please contact me later! ";
    }
}
