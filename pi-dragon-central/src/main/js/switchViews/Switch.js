import React from 'react';

export default function Switch(props) {
	const switches = props.switches;
	const listSwitches = switches.map((switchItem) => 
		<div key={switchItem} className="col-md-3">
			Switch {switchItem} 
			<button id={props.tower +"-"+ switchItem} type="button" className="btn btn-secondary" onClick={(e) => props.onClick(e)}>On</button>
		</div>
	);
    return (
		  <div>{listSwitches}</div>
    );

}

Switch.propTypes = {
		onClick: React.PropTypes.func.isRequired
};
