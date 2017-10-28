package org.pidragon.gpio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pidragon.utils.RestRequest;
import org.pidragon.utils.RestResponse;
import org.springframework.stereotype.Service;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

@Service("PiController")
public class PiController {

	final GpioController gpio = GpioFactory.getInstance();
	Map<String,GpioPinDigitalOutput> gpioMap = new HashMap<String,GpioPinDigitalOutput>();
	final GpioPinDigitalOutput gpio0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00,"SW0", PinState.LOW);
	final GpioPinDigitalOutput gpio1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01,"SW1", PinState.LOW);
	final GpioPinDigitalOutput gpio2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02,"SW2", PinState.LOW);
	final GpioPinDigitalOutput gpio3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03,"SW3", PinState.LOW);
	final GpioPinDigitalOutput gpio4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04,"SW4", PinState.LOW);
	final GpioPinDigitalOutput gpio5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05,"SW5", PinState.LOW);
	final GpioPinDigitalOutput gpio6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06,"SW6", PinState.LOW);
	final GpioPinDigitalOutput gpio7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07,"SW7", PinState.LOW);
	final GpioPinDigitalOutput gpio8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08,"SW8", PinState.LOW);
	final GpioPinDigitalOutput gpio9 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09,"SW9", PinState.LOW);
	final GpioPinDigitalOutput gpio10 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10,"SW10", PinState.LOW);
	final GpioPinDigitalOutput gpio11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11,"SW11", PinState.LOW);
	final GpioPinDigitalOutput gpio12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12,"SW12", PinState.LOW);
	final GpioPinDigitalOutput gpio13 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13,"SW13", PinState.LOW);
	final GpioPinDigitalOutput gpio14 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14,"SW14", PinState.LOW);
	final GpioPinDigitalOutput gpio15 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15,"SW15", PinState.LOW);
	final GpioPinDigitalOutput gpio16 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16,"SW16", PinState.LOW);
	final GpioPinDigitalOutput gpio17 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_17,"SW17", PinState.LOW);
	final GpioPinDigitalOutput gpio18 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18,"SW18", PinState.LOW);
	final GpioPinDigitalOutput gpio19 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_19,"SW19", PinState.LOW);
	final GpioPinDigitalOutput gpio20 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_20,"SW20", PinState.LOW);
	final GpioPinDigitalOutput gpio21 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21,"SW21", PinState.LOW);
	final GpioPinDigitalOutput gpio22 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22,"SW22", PinState.LOW);
	final GpioPinDigitalOutput gpio23 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23,"SW23", PinState.LOW);
	final GpioPinDigitalOutput gpio24 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24,"SW24", PinState.LOW);
	final GpioPinDigitalOutput gpio25 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25,"SW25", PinState.LOW);
	final GpioPinDigitalOutput gpio26 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26,"SW26", PinState.LOW);
	final GpioPinDigitalOutput gpio27 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27,"SW27", PinState.LOW);
	final GpioPinDigitalOutput gpio28 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_28,"SW28", PinState.LOW);
	final GpioPinDigitalOutput gpio29 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29,"SW29", PinState.LOW);
	final GpioPinDigitalOutput gpio30 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_30,"SW30", PinState.LOW);
	final GpioPinDigitalOutput gpio31 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_31,"SW31", PinState.LOW);
	
	public PiController() {
		gpioMap.put("1-1", gpio0);
		gpioMap.put("1-2", gpio1);
		gpioMap.put("1-3", gpio2);
		gpioMap.put("1-4", gpio3);
		gpioMap.put("1-5", gpio4);
		gpioMap.put("1-6", gpio5);
		gpioMap.put("1-7", gpio6);
		gpioMap.put("1-8", gpio7);
		gpioMap.put("2-1", gpio8);
		gpioMap.put("2-2", gpio9);
		gpioMap.put("2-3", gpio10);
		gpioMap.put("2-4", gpio11);
		gpioMap.put("2-5", gpio12);
		gpioMap.put("2-6", gpio13);
		gpioMap.put("2-7", gpio14);
		gpioMap.put("2-8", gpio15);
		gpioMap.put("3-1", gpio16);
		gpioMap.put("3-2", gpio17);
		gpioMap.put("3-3", gpio18);
		gpioMap.put("3-4", gpio19);
		gpioMap.put("3-5", gpio20);
		gpioMap.put("3-6", gpio21);
		gpioMap.put("3-7", gpio22);
		gpioMap.put("3-8", gpio23);
		gpioMap.put("4-1", gpio24);
		gpioMap.put("4-2", gpio25);
		gpioMap.put("4-3", gpio26);
		gpioMap.put("4-4", gpio27);
		gpioMap.put("4-5", gpio28);
		gpioMap.put("4-6", gpio29);
		gpioMap.put("4-7", gpio30);
		gpioMap.put("4-8", gpio31);
	}
	
	public void test(RestRequest request, RestResponse response) {
		response.getParams().put("response", "test good");
		
	}

	public void toggle(RestRequest request, RestResponse response) {
		List<String> switchIds = (ArrayList<String>) request.getParams().get("switchIds");
		
		try {
			for (String switchId : switchIds){
				if (gpioMap.containsKey(switchId)) {
					gpioMap.get(switchId).toggle();
				}
		/*		switch (switchId) {
				case "1-1":
					gpio0.toggle();
					break;
				case "1-2":
					gpio1.toggle();
					break;
				case "1-3":
					gpio2.toggle();
					break;
				case "1-4":
					gpio3.toggle();
					break;
				case "1-5":
					gpio4.toggle();
					break;
				case "1-6":
					gpio5.toggle();
					break;
				case "1-7":
					gpio6.toggle();
					break;
				case "1-8":
					gpio7.toggle();
					break;
				case "2-1":
					gpio8.toggle();
					break;
				case "2-2":
					gpio9.toggle();
					break;
				case "2-3":
					gpio10.toggle();
					break;
				case "2-4":
					gpio11.toggle();
					break;
				case "2-5":
					gpio12.toggle();
					break;
				case "2-6":
					gpio13.toggle();
					break;
				case "2-7":
					gpio14.toggle();
					break;
				case "2-8":
					gpio15.toggle();
					break;
				case "3-1":
					gpio16.toggle();
					break;
				case "3-2":
					gpio17.toggle();
					break;
				case "3-3":
					gpio18.toggle();
					break;
				case "3-4":
					gpio19.toggle();
					break;
				case "3-5":
					gpio20.toggle();
					break;
				case "3-6":
					gpio21.toggle();
					break;
				case "3-7":
					gpio22.toggle();
					break;
				case "3-8":
					gpio23.toggle();
					break;
				case "4-1":
					gpio24.toggle();
					break;
				case "4-2":
					gpio25.toggle();
					break;
				case "4-3":
					gpio26.toggle();
					break;
				case "4-4":
					gpio27.toggle();
					break;
				case "4-5":
					gpio28.toggle();
					break;
				case "4-6":
					gpio29.toggle();
					break;
				case "4-7":
					gpio30.toggle();
					break;
				case "4-8":
					gpio31.toggle();
					break;
				}*/
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getParams().put("response", "on");
	}
	
	public void status(RestRequest request, RestResponse response) {
		List<String> switchIds = (ArrayList<String>) request.getParams().get("switchIds");
		Map<String,Integer> pinStatus = new HashMap<String,Integer>();
		
		try {
			for (String switchId : switchIds){
				if (gpioMap.containsKey(switchId)) {
					pinStatus.put(switchId, gpioMap.get(switchId).getState().getValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getParams().put("status", pinStatus);
	}
}
