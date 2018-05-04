import React, {Component} from 'react';
import PropTypes from 'prop-types';
import Switch from './switchView';

export default function Tower({onButtonPress, towers, switches}) {
  let items = [];
  for (let i = 0; i < towers.length; i++) {
    items.push(
      <div key={towers[i]} className="col-md-3">
        <div>Tower {towers[i]}</div>
        <Switch tower={towers[i]} switches={switches} onButtonPress={onButtonPress}/>
      </div>
    );
  }
  return (
    <div className="container" role="main">
      <div className="row">{items}</div>
    </div>
  );
}
Tower.propTypes = {
  onButtonPress: PropTypes.func,
  towers: PropTypes.array,
  switches: PropTypes.array
};
