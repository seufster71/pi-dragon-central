import React, { Component } from 'react';
import PiLights from './../../piSwitchViews/PiLights.js'

// test
export default class SwitchCentralContainer extends Component {
	  constructor(props) {
	    super(props);

	    this.onButtonPress = this.onButtonPress.bind(this);
	  }

	  const towers = ['1','2','3','4'];
	  const switches = ['1','2','3','4','5','6','7','8'];
	  
	  onButtonPress(param) {

		  console.log("pros " + param)
		  fetch('http://pidragoncentral:8090/api/public/callService',{
			  method: 'POST',
			  headers: {
			      "Content-type": "application/json"
			    },
			  body: JSON.stringify({params:{action:param}})
		  })
		  .then(function(data) {
			  console.log('Request succeeded with JSON response', data);
		  })
		  .catch(function(error) {
			  console.log('Request failed', error);
		  });
	  };

	  render() {
		    return (
		    	<Tower onClick={this.onButtonPress}/>
		    );
	  }
}
