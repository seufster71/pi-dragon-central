import React, { Component } from 'react';
import Tower from './../switchViews/Tower.js'

// test
export default class SwitchCentralContainer extends Component {
	  constructor(props) {
	    super(props);
	    this.state = {towers:['1','2','3','4'],
	    			switches: ['1','2','3','4','5','6','7','8']};
	    this.onButtonPress = this.onButtonPress.bind(this);
	  }

	  onButtonPress(param) {

		  console.log("button press item " + param.target.id)
		  
		  fetch('http://pidragoncentral:8090/api/public/callService',{
			  method: 'POST',
			  headers: {
			      "Content-type": "application/json"
			    },
			  body: JSON.stringify({params:{action:param.target.id}})
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
		    	<Tower onClick={this.onButtonPress} towers={this.state.towers} switches={this.state.switches}/>
		    );
	  }
}
