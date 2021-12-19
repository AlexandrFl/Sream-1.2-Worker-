public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errCallback) {
        this.callback = callback;
        this.errCallback = errCallback;
    }

    public void start() {
        for (int i = 0; i < 20; i++) {
            if (i != 15) {
                callback.onDone("Операция " + i + " завершилась успешно!");
            } else {
                errCallback.onErr("Операция " + i + " завершилась с ошибкой!");
            }
        }
    }
}
