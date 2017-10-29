import React from 'react';

export default function Tower(props) {

    return (
	    <div className="container" role="main">
	      <div className="row">
	      	<div className="col-sm-9">
		        <div>props.towerName</div>
		       
	        </div>
	      </div>
	    </div>
    );

}

Tower.propTypes = {
		onClick: React.PropTypes.func.isRequired
};
