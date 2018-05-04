import React, {Component} from 'react';
import PropTypes from 'prop-types';

export default function Switch({onButtonPress, tower, switches}) {
  let items = [];
  for (let i = 0; i < switches.length; i++) {
    let status = null;
    if (switches[i].s == "on") {
      status = "checked";
    }
    items.push(
      <div key={switches[i].n} className="checkbox" onClick={onButtonPress(tower+"-"+switches[i].n)}>
        <label>
          {status ? (
            <input id={tower+"-"+switches[i].n} type="checkbox" checked data-toggle="toggle" onChange={onButtonPress('test')} />
          ) : (
            <input id={tower+"-"+switches[i].n} type="checkbox" data-toggle="toggle" />
          )}
        </label>
      </div>
    );
  }
  return (
    <div>{items}</div>

  );
}

Switch.propTypes = {
  onButtonPress: PropTypes.func,
  switches: PropTypes.array,
  tower: PropTypes.string
};
