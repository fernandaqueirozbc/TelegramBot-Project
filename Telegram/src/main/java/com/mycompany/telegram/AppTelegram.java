package com.mycompany.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class AppTelegram {

    public static void main(String[] args) {
    
        ApiContextInitializer.init();
        TelegramBotsApi telegram = new TelegramBotsApi();
        MonitorMe mensagem = new MonitorMe();
        try {
            telegram.registerBot(new MonitorMe());
  //          mensagem.enviarMensagem("1170936455", "Teste monitorMe");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
