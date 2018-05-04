import React, { Component } from 'react';
import Tower from '../switchViews/towerView';

// test
export default class SwitchCentralContainer extends Component {
	constructor(props) {
		super(props);
		this.state = {towers:['1','2','3','4'],
		switches: [{'n':'1','s':'off'},
								{'n':'2','s':'off'},
								{'n':'3','s':'off'},
								{'n':'4','s':'off'},
								{'n':'5','s':'off'},
								{'n':'6','s':'off'},
								{'n':'7','s':'off'},
								{'n':'8','s':'off'}]};
		this.onButtonPress = this.onButtonPress.bind(this);
	}

	onButtonPress(param) {
		return (event) => {
			let value = document.getElementById(param);
			console.log(" item "+param+" value " + value.checked);
			let params = {};
			if (value.checked == true){
				params.action = "ON";
			} else {
				params.action = "OFF";
			}

			params.service = "SWITCH_SVC";
			params.switchIds = new Array(param);
			let request = {};
			request.params = params;

			console.log("json " + JSON.stringify(request));

			fetch('http://pidragonc1.local:8090/api/public/callService',{
				method: 'POST',
				headers: {"Content-type": "application/json"},
				body: JSON.stringify(request)
			})
			.then(function(data) {
				console.log('Request succeeded with JSON response', data);
			})
			.catch(function(error) {
				console.log('Request failed', error);
			});
		};

	}

	render() {
		return (
			<Tower towers={this.state.towers} switches={this.state.switches} onButtonPress={this.onButtonPress}/>
		);
	}
}
