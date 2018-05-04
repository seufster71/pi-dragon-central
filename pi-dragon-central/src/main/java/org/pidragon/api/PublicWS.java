package org.pidragon.api;

import org.pidragon.gpio.PiController;
import org.pidragon.utils.RestRequest;
import org.pidragon.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicWS {

	@Autowired
	PiController piController;
	
	@RequestMapping(value = "callService", method = RequestMethod.POST)
	public RestResponse service(@RequestBody RestRequest request) {
		String action = (String) request.getParams().get("action");
		
		RestResponse response = new RestResponse();
		
		switch (action) {
		case "TEST":
			piController.test(request, response);
			break;
		case "TOGGLE":
			piController.toggle(request, response);
			break;
		case "OFF":
			piController.switchOff(request, response);
			break;
		case "ON":
			piController.switchOn(request, response);
			break;
		case "STATUS":
			piController.status(request, response);
			break;
		default:
			break;
		}
		
		
		return response;
	}
}