import React, { Component } from 'react';
import Tower from '../switchViews/towerView';

// test
export default class SwitchCentralContainer extends Component {
	constructor(props) {
		super(props);
		this.state = {towers:['1','2','3','4'],
		switches: [{'n':'1','s':'on'},
								{'n':'2','s':'on'},
								{'n':'3','s':'off'},
								{'n':'4','s':'on'},
								{'n':'5','s':'off'},
								{'n':'6','s':'on'},
								{'n':'7','s':'on'},
								{'n':'8','s':'on'}]};
		this.onButtonPress = this.onButtonPress.bind(this);
	}

	onButtonPress(param) {
		return (event) => {
			let value = document.getElementById(param);
			console.log(" item "+param+" value " + value.checked);
		};
		//fetch('http://pidragoncentral:8090/api/public/callService',{
		//	method: 'POST',
		//	headers: {"Content-type": "application/json"},
		//	body: JSON.stringify({params:{action:param.target.id}})
		//})
		//.then(function(data) {
		//	console.log('Request succeeded with JSON response', data);
		//})
		//.catch(function(error) {
		//	console.log('Request failed', error);
		//});
	}

	render() {
		return (
			<Tower towers={this.state.towers} switches={this.state.switches} onButtonPress={this.onButtonPress}/>
		);
	}
}
