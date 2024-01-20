package com.sacavix.ca.moneytransfers.adapter.configuration;


import com.sacavix.ca.moneytransfers.application.port.in.SendMoneyPort;
import com.sacavix.ca.moneytransfers.application.port.out.LoadAccountPort;
import com.sacavix.ca.moneytransfers.application.port.out.UpdateAccountPort;
import com.sacavix.ca.moneytransfers.application.service.SendMoneyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    SendMoneyPort getMoneyPort(LoadAccountPort loadAccountPort, UpdateAccountPort updateAccountPort){
        return new SendMoneyService(loadAccountPort, updateAccountPort);
    }

}
