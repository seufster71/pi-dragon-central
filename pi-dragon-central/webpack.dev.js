const merge = require('webpack-merge');
const common = require('./webpack.common.js');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const BUILD_DIR = path.resolve(__dirname, 'src/main/resources/static/dist');

module.exports = merge(common, {
  devtool: 'inline-source-map',
  mode: 'development',
  devServer: {
    inline: true,
    historyApiFallback: true,
    contentBase: './src/main/resources/static',
    publicPath: '/',
    proxy: [{ context: ["/api/**","/libs/**"],target: 'http://localhost:8090', secure: false }]
  },
  plugins: [
	    new HtmlWebpackPlugin({
	    	title: 'Pi Lights',
	    	template: './src/main/js/index.html',
	    	filename: BUILD_DIR + '/index.html'
	    }),
	  ],
  output: {
    path: BUILD_DIR,
    filename: 'bundle.js',
    publicPath: '/'
  },
});
