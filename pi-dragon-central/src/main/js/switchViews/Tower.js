import React from 'react';
import Switch from './Switch.js';

export default function Tower(props) {
	const towers = props.towers;
	const listTowers = towers.map((tower) => 
		<div key={tower} className="col-md-3">
			Tower {tower} 
			<Switch onClick={props.onClick} tower={tower} switches={props.switches}/>
		</div>
	);
	
    return (
	    <div className="container" role="main">
	      <div className="row">
		      {listTowers}
	      </div>
	    </div>
    );

}

Tower.propTypes = {
		onClick: React.PropTypes.func.isRequired
};
