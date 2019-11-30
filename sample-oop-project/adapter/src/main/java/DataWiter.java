public class DataWiter implements Writer {
    public String save(String mess) {
        NewWriter adapter = new NewWriter();

        return adapter.save(mess, 1);
    }
}
