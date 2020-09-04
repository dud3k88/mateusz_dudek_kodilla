public class Inform implements InformationService {
    @Override
    public void sendInformation(User user) {
        System.out.println("Zamówienie ok" + user.getUserName());
    }
}
