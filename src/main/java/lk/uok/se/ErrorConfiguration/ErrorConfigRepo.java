package lk.uok.se.ErrorConfiguration;

import lk.uok.se.DTO.Message;

import java.util.List;

public interface ErrorConfigRepo {
    public List<Message> findingerrors(List<Message> messages);
}
