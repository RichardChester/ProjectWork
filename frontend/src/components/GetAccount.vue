<template>


    <div>
        <table style="width:50%">
            <tr>
                <th>Account Number</th>
                <th><input v-model = "Form.accountNumber"></th>
                <th><button type="submit" @click="onSubmit">Search</button></th>

            </tr>
            <tr>
                <td> {{FirstName}}</td>
                <td> {{LstName}}</td>
                <td><button type="button" @click="delte">delete</button></td>
            </tr>
            <tr>
                <td> <input placeholder="enter new first name here to edit" v-model = "update1.newFirst"></td>
                <td> <input placeholder="enter new first name here to edit" v-model = "update1.newSecond"></td>
                <td><button type="button" @click="update">confirm edit</button></td>
            </tr>
        </table>
    </div>



</template>


<script>
    import axios from 'axios'

    export default {
        name: 'GetAccount',
        props: {
            msg: String
        },
        data(){
            return{
                update1:{
                  newFirst:"",
                  newSecond:"",
                },
                Form:{
                    accountNumber:'',

                },
                FirstName:"",
                LstName:"",




            }
        },
        methods: {
            onSubmit (){
                axios.get('http://localhost:8010/user/find/'+this.Form.accountNumber)
                    .then(response => {
                        if(response.status===200){
                            console.log(response.data);
                             this.FirstName=response.data[0].firstName;
                             this.LstName=response.data[0].secondName;

                        }
                    })
                    .catch(error => {
                        console.log(error);
                    })
            },
            delte(){
                axios.delete('http://localhost:8010/user/'+this.Form.accountNumber)
                    .then(response => {
                        if (response.status === 200) {
                            this.$router.push('/');
                        }
                    })


            },
            update(){
                axios.delete('http://localhost:8010/user/'+this.update1)
                    .then(response => {
                        if (response.status === 200) {
                            this.$router.push('/');
                        }
                    })


            }
        }
    }

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

    h3 {
        margin: 40px 0 0;
    }
    ul {
        list-style-type: none;
        padding: 0;
    }
    li {
        display: inline-block;
        margin: 0 10px;
    }
    a {
        color: #42b983;
    }
    .active {
        background-color: aqua;
    }
</style>