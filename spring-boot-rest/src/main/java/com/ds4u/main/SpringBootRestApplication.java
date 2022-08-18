package com.ds4u.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

import org.bitcoinj.core.Address;
import org.bitcoinj.kits.WalletAppKit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ds4u.api.CallingRestApi;


@SpringBootApplication(scanBasePackages={"com"})
public class SpringBootRestApplication {

	private static Address forwardingAddress;
    private static WalletAppKit kit;
    
    /**
     * Main method
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
		
	}
}
