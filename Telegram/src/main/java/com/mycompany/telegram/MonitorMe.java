
package com.mycompany.telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MonitorMe extends TelegramLongPollingBot{
     SendMessage message = new SendMessage();
    
    @Override
    public String getBotToken() {
    return "1127314189:AAHcH7b9CmwknOeiCJLXN3kayd_-77LLFj4";
    }

    @Override
    public void onUpdateReceived(Update update) {
        Long chatId = update.getMessage().getChatId();
        String mensagem = update.getMessage().getText();
        System.out.println(mensagem);
        if(mensagem.equals("Oi")){
            enviarMensagem(chatId, "Bem vindo ao MonitorMe!");
        }
    }

    @Override
    public String getBotUsername() {
       return "@AdmMonitorMe_bot";
    }
 
    public void enviarMensagem(Long chatId, String mensagem) {
      message.setChatId(chatId);
      message.setText(mensagem);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
