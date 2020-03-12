/**
 * Created by mak1115 on 3/12/2020.
 */
abstract class SMSSender {

    abstract public void eastablishConnectionWithYourTower();

    abstract public void destroyConnectionWithYourTower();

    public void checkForDND() {
        //check for number present in DND.
    }

    public void checkForTelecomRules() {
        //Check for telecom rules
    }

    public void sendSMS() {
        eastablishConnectionWithYourTower();
        checkForDND();
        checkForTelecomRules();
        //sending SMS to numbers...numbers. Once we know how to establish a connection
        // and destroy a connection*/
    }
}
