class Template {
    public static void main(String args[]) {
        Excel e = new Excel();
        e.readProcessSave();

        FileData f = new FileData();
        f.readProcessSave();
    }
}

abstract class DataProcesser {

    protected void readProcessSave() {
        this.readData();
        this.processData();
        this.SaveData();
    }

    protected abstract void readData();

    protected abstract void processData();

    protected void SaveData() {
        System.out.println("Save Data to DB");
    }
}

class Excel extends DataProcesser {

    public void readData() {
        System.out.println("Excel Data Read");
    }

    public void processData() {
        System.out.println("Excel process data Read");
    }
}

class FileData extends DataProcesser {

    public void readData() {
        System.out.println("FileData Data Read");
    }

    public void processData() {
        System.out.println("FileData process data Read");
    }
}
