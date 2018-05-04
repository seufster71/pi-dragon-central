import React from 'react';
import { render } from 'react-dom';
import configureStore from "./store/configureStore";
import { Provider } from "react-redux";
import { BrowserRouter } from "react-router-dom";
import SwitchCentralContainer from './switchCentral/switchCentralContainer.js';
import Bootstrap from 'bootstrap/dist/css/bootstrap.css';
import Theme from './theme.css';

if (process.env.NODE_ENV !== "production") {
  console.log("Looks like we are in development mode!");
}

const store = configureStore();
//store.dispatch(initPublic());

render(
  <Provider store={store}>
    <BrowserRouter>
      <SwitchCentralContainer />
    </BrowserRouter>
  </Provider>,
  document.getElementById("app")
);
