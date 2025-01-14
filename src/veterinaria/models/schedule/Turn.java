package veterinaria.models.schedule;

import veterinaria.models.client.Client;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Turn implements Serializable {
    private static int turnsQuantity = 0;
    private int turnNumber;
    private Client client;
    private String reason;
    private Date date;
    private boolean status;

    public Turn() {
        turnsQuantity++;
        turnNumber = turnsQuantity;
        client = new Client();
        reason = "";
        date = null;
        status = true;
    }

    public Turn(Client client, String reason, Date date) {
        turnsQuantity++;
        this.turnNumber = turnsQuantity;
        this.client = client;
        this.reason = reason;
        this.date = date;
        this.status = true;
    }

    public Turn(Client client, String reason, Date date, boolean status) {
        turnsQuantity++;
        this.turnNumber = turnsQuantity;
        this.client = client;
        this.reason = reason;
        this.date = date;
        this.status = status;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDate() {
        return date;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turn turn = (Turn) o;
        return turnNumber == turn.turnNumber && status == turn.status && Objects.equals(client, turn.client) && Objects.equals(reason, turn.reason) && Objects.equals(date, turn.date);
    }

    @Override
    public String toString() {
        return "{Número de Turno: " + turnNumber +
                ", Cliente: " + client.getName() + " " + client.getLastName() +
                ", DNI: " + client.getDNI() +
                ", Motivo: '" + reason + '\'' +
                ", Fecha: " + date.toInstant().toString().substring(8, 10) + "/" + date.toInstant().toString().substring(5, 7) + "/" + date.toInstant().toString().substring(0,4) +
                '}';
    }
}