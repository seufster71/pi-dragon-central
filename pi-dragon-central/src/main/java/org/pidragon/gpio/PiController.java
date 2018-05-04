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
	final GpioPinDigitalOutput gpio2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02,"SW2", PinState.HIGH);
	final GpioPinDigitalOutput gpio3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03,"SW3", PinState.HIGH);
	final GpioPinDigitalOutput gpio4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04,"SW4", PinState.HIGH);
	final GpioPinDigitalOutput gpio5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05,"SW5", PinState.HIGH);
	final GpioPinDigitalOutput gpio6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06,"SW6", PinState.HIGH);
	final GpioPinDigitalOutput gpio7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07,"SW7", PinState.HIGH);
	final GpioPinDigitalOutput gpio8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08,"SW8", PinState.LOW);
	final GpioPinDigitalOutput gpio9 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09,"SW9", PinState.LOW);
	final GpioPinDigitalOutput gpio10 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10,"SW10", PinState.HIGH);
	final GpioPinDigitalOutput gpio11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11,"SW11", PinState.HIGH);
	final GpioPinDigitalOutput gpio12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12,"SW12", PinState.HIGH);
	final GpioPinDigitalOutput gpio13 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13,"SW13", PinState.HIGH);
	final GpioPinDigitalOutput gpio14 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14,"SW14", PinState.HIGH);
	final GpioPinDigitalOutput gpio15 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15,"SW15", PinState.HIGH);
	final GpioPinDigitalOutput gpio16 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16,"SW16", PinState.LOW);
	final GpioPinDigitalOutput gpio17 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_17,"SW17", PinState.LOW);
	final GpioPinDigitalOutput gpio18 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18,"SW18", PinState.HIGH);
	final GpioPinDigitalOutput gpio19 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_19,"SW19", PinState.HIGH);
	final GpioPinDigitalOutput gpio20 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_20,"SW20", PinState.HIGH);
	final GpioPinDigitalOutput gpio21 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21,"SW21", PinState.HIGH);
	final GpioPinDigitalOutput gpio22 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22,"SW22", PinState.HIGH);
	final GpioPinDigitalOutput gpio23 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23,"SW23", PinState.HIGH);
	final GpioPinDigitalOutput gpio24 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24,"SW24", PinState.LOW);
	final GpioPinDigitalOutput gpio25 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25,"SW25", PinState.LOW);
	final GpioPinDigitalOutput gpio26 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26,"SW26", PinState.HIGH);
	final GpioPinDigitalOutput gpio27 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27,"SW27", PinState.HIGH);
	final GpioPinDigitalOutput gpio28 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_28,"SW28", PinState.HIGH);
	final GpioPinDigitalOutput gpio29 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29,"SW29", PinState.HIGH);
	final GpioPinDigitalOutput gpio30 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_30,"SW30", PinState.HIGH);
	final GpioPinDigitalOutput gpio31 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_31,"SW31", PinState.HIGH);
	
	public PiController() {
		gpioMap.put("1-eth", gpio0);
		gpioMap.put("1-fan", gpio1);
		gpioMap.put("1-1", gpio2);
		gpioMap.put("1-2", gpio3);
		gpioMap.put("1-3", gpio4);
		gpioMap.put("1-4", gpio5);
		gpioMap.put("1-5", gpio6);
		gpioMap.put("1-6", gpio7);
		gpioMap.put("2-eth", gpio8);
		gpioMap.put("2-open", gpio9);
		gpioMap.put("2-1", gpio10);
		gpioMap.put("2-2", gpio11);
		gpioMap.put("2-3", gpio12);
		gpioMap.put("2-4", gpio13);
		gpioMap.put("2-5", gpio14);
		gpioMap.put("2-6", gpio15);
		gpioMap.put("open-1", gpio16);
		gpioMap.put("open-2", gpio17);
		gpioMap.put("3-1", gpio18);
		gpioMap.put("3-2", gpio19);
		gpioMap.put("3-3", gpio20);
		gpioMap.put("3-4", gpio21);
		gpioMap.put("3-5", gpio22);
		gpioMap.put("3-6", gpio23);
		gpioMap.put("fan-4-1", gpio24);
		gpioMap.put("fan-4-2", gpio25);
		gpioMap.put("4-1", gpio26);
		gpioMap.put("4-2", gpio27);
		gpioMap.put("4-3", gpio28);
		gpioMap.put("4-4", gpio29);
		gpioMap.put("4-5", gpio30);
		gpioMap.put("4-6", gpio31);
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
			}
		} catch (Exception e) {
			response.getParams().put("status", "ERROR");
			response.getParams().put("statusMsg", "Error while changing state");
		}
		response.getParams().put("response", "on");
	}
	
	public void switchOff(RestRequest request, RestResponse response) {
		List<String> switchIds = (ArrayList<String>) request.getParams().get("switchIds");
		StringBuilder status = new StringBuilder();
		try {
			for (String switchId : switchIds){
				if (gpioMap.containsKey(switchId)) {
					gpioMap.get(switchId).setState(PinState.HIGH);
					if (gpioMap.get(switchId).getState().getValue() == 1) {
						status.append("::").append(switchId).append(":OFF");
					} else {
						status.append("::").append(switchId).append(":ON");
					}
				}
			}
			response.getParams().put("status", "SUCCESS");
			response.getParams().put("statusMsg", status);
		} catch (Exception e) {
			response.getParams().put("status", "ERROR");
			response.getParams().put("statusMsg", "Error while changing state");
		}
	}
	
	public void switchOn(RestRequest request, RestResponse response) {
		List<String> switchIds = (ArrayList<String>) request.getParams().get("switchIds");
		StringBuilder status = new StringBuilder();
		try {
			for (String switchId : switchIds){
				if (gpioMap.containsKey(switchId)) {
					gpioMap.get(switchId).setState(PinState.LOW);
					if (gpioMap.get(switchId).getState().getValue() == 0) {
						status.append("::").append(switchId).append(":ON");
					} else {
						status.append("::").append(switchId).append(":OFF");
					}
				}
			}
			response.getParams().put("status", "SUCCESS");
			response.getParams().put("statusMsg", status);
		} catch (Exception e) {
			response.getParams().put("status", "ERROR");
			response.getParams().put("statusMsg", "Error while changing state");
		}
	}
	
	public void status(RestRequest request, RestResponse response) {
		Map<String,String> pinStatus = new HashMap<String,String>();
		
		try {
			if (request.containsParam("switchIds") ) {
				List<String> switchIds = (ArrayList<String>) request.getParams().get("switchIds");
				if ( switchIds.size() > 0) {
					for (String switchId : switchIds){
						if (gpioMap.containsKey(switchId)) {
							String status = "On";
							if (gpioMap.get(switchId).getState().getValue() == 1) {
								status = "Off";
							}
							pinStatus.put(switchId, status);
						}
					}
				}
			} else {
				for (String key : gpioMap.keySet()) {
					String status = "On";
					if (gpioMap.get(key).getState().getValue() == 1) {
						status = "Off";
					}
					pinStatus.put(key, status);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getParams().put("status", pinStatus);
	}
}
