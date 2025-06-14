package top.wmd001.behavioral.state;

public class BotContext {

    private State state;
    private boolean noChat = true;
    private int count = 0;

    public String chat(String input) {
        if ("bye".equalsIgnoreCase(input)) {
            state = new DisconnectState();
            return state.init();
        } else if ("hello".equalsIgnoreCase(input)) {
            state = new ConnectionState();
            return state.init();
        } else if (noChat && count++ < 2){
            state = new BusyState();
            noChat = false;
            return state.init();
        }
        return state.reply(input);
    }

}
