import React from 'react';

export default function Switch(props) {

    return (
	      	<div className="col-sm-9">
		        <div>props.switchName</div>
		        <button id="toggle" type="button" className="btn btn-secondary" onClick={(e) => props.onClick("on",e)}>On</button>
	        </div>
    );

}

Switch.propTypes = {
		onClick: React.PropTypes.func.isRequired
};
