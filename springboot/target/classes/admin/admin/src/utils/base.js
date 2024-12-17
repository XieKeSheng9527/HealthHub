const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9a097266/",
            name: "springboot9a097266",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9a097266/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "Biohealth management system"
        } 
    }
}
export default base
