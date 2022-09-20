package co.develhope.websocket2.entities;

public class ClientMessageDTO {

    private String clientName;
    private String clientAlert;
    private String clientMsg;

    public ClientMessageDTO() {
    }

    public ClientMessageDTO(String clientName, String clientAlert, String clientMsg) {
        this.setClientName(clientName);
        this.setClientAlert(clientAlert);
        this.setClientMsg(clientMsg);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAlert() {
        return clientAlert;
    }

    public void setClientAlert(String clientAlert) {
        this.clientAlert = clientAlert;
    }

    public String getClientMsg() {
        return clientMsg;
    }

    public void setClientMsg(String clientMsg) {
        this.clientMsg = clientMsg;
    }

    @Override
    public String toString() {
        return "ClientMessageDTO{" +
                "clientName='" + clientName + '\'' +
                ", clientAlert='" + clientAlert + '\'' +
                ", clientMsg='" + clientMsg + '\'' +
                '}';
    }
}