public class Adaptor {
    public static void main(String[] args) {
        AndroidHeadSet ah = new HeadSetAdaptor();
        ah.getSound("I phone sound");
    }
}

interface AndroidHeadSet {
    void getSound(String str);

}

class IPhoneHeadSet {
    public void getQalitySound(String str) {
        System.out.print(str);
    }
}

class HeadSetAdaptor implements AndroidHeadSet {

    IPhoneHeadSet iph = new IPhoneHeadSet();

    public void getSound(String str) {
        iph.getQalitySound(str);
    }
}

class ListenMusic {
    private AndroidHeadSet headset;

    public ListenMusic(AndroidHeadSet headset) {
        this.headset = headset;
    }

    public void listenSong(String str) {
        headset.getSound(str);
    }
}