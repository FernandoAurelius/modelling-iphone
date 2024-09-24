import devices.ElectronicDevice;
import devices.IPhone;

public class Principal {
    public static void main(String[] args) {
        ElectronicDevice mobilePhone = new IPhone();

        mobilePhone.call();
        mobilePhone.answer();
        mobilePhone.startVoiceMail();

        IPhone iPhone = new IPhone();
        iPhone.play();
        iPhone.pause();
        iPhone.selectMusic("Just the two of us");

        iPhone.addNewGuide();
        iPhone.showPage();
        iPhone.updatePage();
    }
}
