SceneJS.setConfigs({
    pluginPath:"public/js/scenejs/plugins"
});

function showView(geom) {
	var boundMinX = 0, boundMinY = 0, boundMinZ = 0,
    boundMaxX = 0, boundMaxY = 0, boundMaxZ = 0;
	if(geom.bound){
        boundMinX = Math.min(0, geom.bound.min.x);
        boundMinY = Math.min(0, geom.bound.min.y);
        boundMinZ = Math.min(0, geom.bound.min.z);
        boundMaxX = Math.max(0, geom.bound.max.x);
        boundMaxY = Math.max(0, geom.bound.max.y);
        boundMaxZ = Math.max(0, geom.bound.max.z);
        var node = {
                geometry_info: geom,
                boundMinX : boundMinX,
                boundMinY : boundMinY,
                boundMinZ : boundMinZ,
                boundMaxX : boundMaxX,
                boundMaxY : boundMaxY,
                boundMaxZ : boundMaxZ,
                type:"geometry/ifcmodel"
        };
        window.scene.getNode("my-lights",function(xxx){
	   		xxx.addNode({type:"material",nodes:[node]});
	   	});
	}
}



function createScene(){
	var yaw = -24.071999999999747;
	var  pitch= -88.80199999999668;
	var minPitch= -80,
	maxPitch=-10,
	zoom= - (~~(maxZoom/1.5)),
	zoomSensitivity= -(~~(maxZoom/15)),
	//eye={x:middle.x,y: - middle.y* 10,z: maxZoom/5*4},
	eye = {x: 4120.287109375, y: -112420.634765625, z: 9389.171752929688},
	look= middle;
	$window = $(window);
	
	
	 var sceneViewObj = {
		        canvasId:"mySceneCanvas",
		        type: "scene",
		        nodes: [
					{
		                type: "models/backgrounds/gradient",
		                color: [ // Default color
		                    0.755, 0.725, 0.745, 1.0, // top left (R,G,B,A)
		                    0.755, 0.725, 0.745, 1.0, // top left (R,G,B,A)
		                    0.85, 0.9, 0.98, 1.0, // bottom right
		                    0.85, 0.9, 0.98, 1.0   // bottom left
		                ]
		            },
					{
		        	type: "cameras/pickFlyOrbit",
		        	showCursor: true,
		            id:'cameras',
		            yaw:yaw,
		            pitch:pitch,
		            minPitch:minPitch,
		            maxPitch:maxPitch,
		            zoom:zoom,
		            zoomSensitivity:zoomSensitivity,
		            eye:eye,
		            look:look,
		            nodes: [{
		                type: 'camera',
		                id: 'main-camera',
		                optics: {
		                    type: 'perspective',
		                    far: 900000000,
		                    near: 132.44078865666725,
		                    aspect: $window.width() / $window.height(),
		                    fovy: 37.8493
		                },
		                nodes: [{
		                    type: 'renderer',
		                    id: 'main-renderer',
		                    clear: {
		                        color: true,
		                        depth: true,
		                        stencil: true
		                    },
		                    nodes:[{
		                        type:"enable",
		                        id:"myEnable",
		                        enabled:true,
		                        nodes: [{
		                            type: 'lights',
		                            id: 'my-lights',
		                            lights: [
		                                {
		                                    mode:"ambient",
		                                    color:{ r:0.9, g:0.9, b:0.9},
		                                    diffuse:true,
		                                    specular:true
		                                },
		                                {
		                                    mode:"dir",
		                                    color:{ r:1.0, g:1.0, b:1.0 },
		                                    diffuse:true,
		                                    specular:true,
		                                    dir:{ x:-10, y:-10, z:-10 },
		                                    space:"view"
		                                },
		                                {
		                                    type:		'light',
		                                    id:			'sun-light',
		                                    mode:		'dir',
		                                    color:		{r: 0.6, g: 0.6, b: 0.6},
		                                    dir:   		{x: 10000, y: -100000, z: 10000.0},
		                                    pos:   		{x: 10000, y: 100000, z: 10000.0},
		                                    diffuse:	true,
		                                    specular:	true,
		                                    space:"world"
		                                }
		                            ]
		                        }]
		                    }]
		                }]
		            }]
		        }]
		    };
	    window.scene =  SceneJS.createScene(sceneViewObj);	    
}

function bindEvent(sceneNodes) {
}


function easeOut(t, b, c, d) {
    var ts = (t /= d) * t;
    var tc = ts * t;
    return b + c * (-1 * ts * ts + 4 * tc + -6 * ts + 4 * t);
}

function easeIn(t, b, c, d) {
    var ts = (t /= d) * t;
    var tc = ts * t;
    return b + c * (tc * ts);
}

