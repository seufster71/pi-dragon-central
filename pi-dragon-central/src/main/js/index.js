import React from 'react';
import ReactDom from 'react-dom';
import PiLightsContainer from './switchCentral/SwitchCentralContainer.js';
import Bootstrap from 'bootstrap/dist/css/bootstrap.css';
import Theme from './theme.css';

class App extends React.Component {

	constructor() {
	    super();
	    this.state = {
	      headerName: 'RaspBerry Pi Dragon',
	    };
	  }
  render() {
    return (
		<div>
			<SwitchCentralContainer/>
		</div>
    );
  }
}

ReactDom.render( <App/>, document.getElementById('app') );
